package toptal.dmaragkos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class KnightTour {
    //should be 100000000
    private static final int MAX_MOVES = 1000;
    private static final Set<Position> VISITED_POINTS = new HashSet<>();

    private static final int[][] POSSIBLE_MOVES = new int[][]{
            {-2, -1},
            {-2, 1},
            {-1, -2},
            {-1, 2},
            {1, -2},
            {1, 2},
            {2, -1},
            {2, 1}
    };

    public int solution(final int A, final int B) {
        return tour(new Position(A, B), 0, new Position(0, 0));
    }

    private List<Position> getPossibleMoves(final Position start) {
        List<Position> positions = new ArrayList<>();
        for (int[] move : POSSIBLE_MOVES) {
            Position position = new Position(start.getX() + move[0], start.getY() + move[1]);
            if (!VISITED_POINTS.contains(position)) {
                positions.add(position);
            }
        }
        return positions;
    }

    private int tour(final Position destination, final int depth, final Position currentPoint) {
        int result;
        if (currentPoint.equals(destination)) {
            return depth;
        }
        if (depth > MAX_MOVES) {
            return -2;
        }
        int minMoves = MAX_MOVES;
        final List<Position> nextPositions = getPossibleMoves(currentPoint);

        for (Position nextPosition : nextPositions) {
            VISITED_POINTS.add(nextPosition);
            result = tour(destination, depth + 1, nextPosition);
            // no solution on this path
            if (result < 0) {
                continue;
            }
            minMoves = Math.min(depth, result);
        }

        return minMoves;
    }


    private class Position {
        private int x;
        private int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            if (x != position.x) return false;
            return y == position.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}
