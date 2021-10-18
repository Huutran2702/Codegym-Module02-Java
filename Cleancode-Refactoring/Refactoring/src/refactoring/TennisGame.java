package refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String displayResult = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            switch (player1Score)
            {
                case 0:
                    displayResult = "Love-All";
                    break;
                case 1:
                    displayResult = "Fifteen-All";
                    break;
                case 2:
                    displayResult = "Thirty-All";
                    break;
                case 3:
                    displayResult = "Forty-All";
                    break;
                default:
                    displayResult = "Deuce";
                    break;

            }
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            displayResult = getDisplayResult(player1Score, player2Score);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { displayResult +="-"; tempScore = player2Score;}
                switch(tempScore)
                {
                    case 0:
                        displayResult +="Love";
                        break;
                    case 1:
                        displayResult +="Fifteen";
                        break;
                    case 2:
                        displayResult +="Thirty";
                        break;
                    case 3:
                        displayResult +="Forty";
                        break;
                }
            }
        }
        return displayResult;
    }

    private static String getDisplayResult(int player1Score, int player2Score) {
        String displayResult;
        int minusResult = player1Score - player2Score;
        if (minusResult==1) displayResult ="Advantage player1";
        else if (minusResult ==-1) displayResult ="Advantage player2";
        else if (minusResult>=2) displayResult = "Win for player1";
        else displayResult ="Win for player2";
        return displayResult;
    }
}
