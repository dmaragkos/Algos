//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by a604592 on 9/25/2016.
// */
//public class KnightTour {
//    private static final int MAX_MOVES = 100000000;
//
//    public int solution(int A, int B) {
//        return tour(new Position(A, B), 0, null);
//    }
//
//
//    public List<Position> getNextPositions(Position start) {
//        List<Position> possibleMoves = new ArrayList<>();
//        possibleMoves.add(new Position(-2, -1));
//        possibleMoves.add(new Position(-2, 1));
//        possibleMoves.add(new Position(-1, -2));
//        possibleMoves.add(new Position(-1, 2));
//        possibleMoves.add(new Position(1, -2));
//        possibleMoves.add(new Position(1, 2));
//        possibleMoves.add(new Position(2, -1));
//        possibleMoves.add(new Position(2, 1));
//
//        List<Position> positions = new ArrayList<>();
//
//        for (int i = 0; i < possibleMoves.size(); i++) {
//            Position move = possibleMoves.get(i);
//            Position position = new Position(start.getX() + move.getX(), start.getY() + move.getY());
//            positions.add(position);
//        }
//
//        return positions;
//    }
//
//    public int tour(Position destination, int depth, Position currentPoint) {
////        cache = cache || {};
////        int result = (cache[destination.x] || {})[destination.y];
////
////        if (result) {
////            return result;
////        }
//        int result;
//        if (destination.x == 0 && destination.y == 0) {
//            result = 0;
//        } else if (depth > 100) {
//            result = -2;
//        } else {
//            int minMoves = MAX_MOVES;
//            List<Position> nextPositions = getNextPositions(destination);
//
//            for (int i = 0; i < nextPositions.size(); i++) {
//                Position nextPosition = nextPositions.get(i);
//                result = tour(nextPosition, depth + 1, cache);
//
//                if (result < 0) {
//                    continue;
//                }
//
//                minMoves = Math.min(minMoves, 1 + result);
//            }
//
//            if (minMoves == MAX_MOVES) {
//                result = -2;
//            } else {
//                result = minMoves;
//            }
//        }
//
////        cache[destination.x] = cache[destination.x] || {};
////        cache[destination.x][destination.y] = result;
//
//        return result;
//    }
//
//
//    public class Position {
//        private int x;
//        private int y;
//
//        public Position(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        public int getX() {
//            return x;
//        }
//
//        public int getY() {
//            return y;
//        }
//    }
//}
