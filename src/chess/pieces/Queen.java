package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow(), position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);

		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);

		}

		return matriz;
	}

}
