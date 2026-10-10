package com.problems.arrays;

public class IslandPerimeter {
    static void main() {
        System.out.println(islandPerimeter(new int[][]{
                                new int[]{0, 1, 0, 0},
                                new int[]{1, 1, 1, 0},
                                new int[]{0, 1, 0, 0},
                                new int[]{1, 1, 0, 0}
                        }
                )
        );
        System.out.println(islandPerimeter(new int[][]{
                                new int[]{1},
                        }
                )
        );
        System.out.println(islandPerimeter(new int[][]{
                                new int[]{1, 0},
                        }
                )
        );
    }

    public static int islandPerimeter(int[][] grid) {
        var perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += findSidesSurroundedByWater(grid, i, j);
                }
            }
        }

        return perimeter;
    }

    private static int findSidesSurroundedByWater(final int[][] grid, final int i, final int j) {
        var sides = 0;
        // left
        if (j - 1 < 0 || grid[i][j - 1] == 0) {
            sides++;
        }
        // right
        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
            sides++;
        }
        // top
        if (i - 1 < 0 || grid[i - 1][j] == 0) {
            sides++;
        }
        // bottom
        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
            sides++;
        }

        return sides;
    }
}
