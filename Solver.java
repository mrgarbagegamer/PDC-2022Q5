public class Solver
{
    public static int[] solver()
    {
        // A-J are unique numbers from 0-9
        // A * B + C >= D + E
        // F * G + H >= I + J
        // (A * B + C) / (D + E) = 1
        // (F * G + H) / (I + J) = 6

        int[] terms = new int[10];

        for (int A = 0; A <= 9; A++)
        {
            for (int B = 0; B <= 9; B++)
            {
                if (A == B) continue;

                for (int C = 0; C <= 9; C++)
                {
                    if (A == C || B == C) continue;
                    
                    for (int D = 0; D <= 9; D++)
                    {
                        if (A == D || B == D || C == D) continue;

                        for (int E = 0; E <= 9; E++)
                        {
                            if (A == E || B == E || C == E || D == E) continue;
                            if ((double) (A * B + C) / (D + E) != 1.0) continue;

                            for (int F = 0; F <= 9; F++)
                            {
                                if (A == F || B == F || C == F || D == F || E == F) continue;

                                for (int G = 0; G <= 9; G++)
                                {
                                    if (A == G || B == G || C == G || D == G || E == G || F == G) continue;
                                    
                                    for (int H = 0; H <= 9; H++)
                                    {
                                        if (A == H || B == H || C == H || D == H || E == H || F == H || G == H) continue;

                                        for (int I = 0; I <= 9; I++)
                                        {
                                            if (A == I || B == I || C == I || D == I || E == I || F == I || G == I || H == I) continue;
                                            
                                            for (int J = 0; J <= 9; J++)
                                            {
                                                if (A == J || B == J || C == J || D == J || E == J || F == J || G == J || H == J || I == J) continue;

                                                if ((double) (F * G + H) / (I + J) != 6.0) continue;

                                                // If we reach this point, we have a solution
                                                terms[0] = A;
                                                terms[1] = B;
                                                terms[2] = C;
                                                terms[3] = D;
                                                terms[4] = E;
                                                terms[5] = F;
                                                terms[6] = G;
                                                terms[7] = H;
                                                terms[8] = I;
                                                terms[9] = J;

                                                return terms;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] result = solver();

        if (result != null)
        {
            System.out.println("Solution found:");
            for (int i = 0; i < result.length; i++)
            {
                System.out.println(result[i]);
            }
        }
        else
        {
            System.out.println("No solution found.");
        }
    }
}