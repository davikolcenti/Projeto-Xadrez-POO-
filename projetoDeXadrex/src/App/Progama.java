package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ChessLayer.ChessException;
import ChessLayer.ChessMatch;
import ChessLayer.ChessPiece;
import ChessLayer.ChessPosition;

public class Progama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try {
                // 1. Imprime o estado atual
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();

                // 2. Lê a posição de origem
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                // 3. Imprime os movimentos possíveis
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();

                // 4. Lê a posição de destino
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                // 5. Executa o movimento
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                // Adiciona a peça capturada à lista
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

                // Lógica de Promoção (Se houver uma peça promovida)
                if (chessMatch.getPromoted() != null) {
                    System.out.print("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    // Garante que o usuário insira um valor válido
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
                        System.out.print("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    // O método replacePromotedPiece já lança ChessException, se for o caso
                    chessMatch.replacePromotedPiece(type);
                }
            }
            // Trata exceções de xadrez (movimento inválido, etc.)
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Espera por enter
            }
            // Trata exceções de entrada (formato de posição incorreto, etc.)
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Espera por enter
            }
            // Tratamento genérico para outras exceções de tempo de execução
            catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }
        // Fim do jogo: Limpa a tela e imprime a partida final
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}