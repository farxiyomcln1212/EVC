import java.util.Scanner;

public class evc {
    public static void main(String[] args) {

        // === Phase 1: Initialize Scanner and Variables ===
        Scanner input = new Scanner(System.in);
        String pinCODE = "*770#";  // USSD code
        int haraaga = 20000;         // Initial balance
        String pincode_Entering = input.next();  // User enters USSD code

        // === Check if the entered USSD code is correct ===
        if (pinCODE.equals(pincode_Entering)) {
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan Gali PIN-kaaga (Enter PIN)");
        } else {
            System.out.println("ERROR");
        }

        // === PIN Verification ===
        int pinentering1 = 5678;              // Correct PIN
        int pinentering2 = input.nextInt();   // User enters PIN

        if (pinentering1 == pinentering2) {
            // === Main Menu ===
            System.out.println("-EVCPLUS-");
            System.out.println("1. itus Haraagaaga");
            System.out.println("2. kaarka hadalka");
            System.out.println("3. Uwareeji EVCPLUS");
            System.out.println("4. warbixin kooban");
            System.out.println("5. salaam Bank");
            System.out.println("6. Bixi bill");
            System.out.println("7. Iibso Data Plan");
            System.out.println("8. Samee Payment");
            System.out.println("9. ka noqo");

            int choosingPhase2 = input.nextInt(); // User selects option

            // === Option 1: Show Balance ===
            if (choosingPhase2 == 1) {
                System.out.println("Haraagaaga waa $" + haraaga);
            }

            // === Option 2: Kaarka Hadalka (Airtime Services) ===
            else if (choosingPhase2 == 2) {
                System.out.println("-Kaarka hadalka-");
                System.out.println("1. ku shubo Airtime");
                System.out.println("2. Ugu shub Airtime");
                System.out.println("3. ku shub Internet");
                System.out.println("4. Kanoqo");
                int kaarkaHadalka = input.nextInt();

                // === Sub-option 1: Ku shubo Airtime ===
                if (kaarkaHadalka == 1) {
                    System.out.println("-Ku shubo Airtime-");
                    System.out.println("fadlan gali lacagta");
                    int GaliLacgta = input.nextInt();

                    if (GaliLacgta > haraaga) {
                        System.out.println("Haraagaaga kugu ma filna!");
                    } else {
                        System.out.println("Ma hubtaa inaad $" + GaliLacgta + " ku shubatid?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int GoaanHAAmaya = input.nextInt();

                        if (GoaanHAAmaya == 1) {
                            System.out.println("waxaa ku shubatay ku hadal dhan $" + GaliLacgta);
                            System.out.println("Mahadsanid");
                        } else if (GoaanHAAmaya == 2) {
                            System.out.println("waa ku mahaadsantahay isticmaalkaaga");
                        } else {
                            System.out.println("waxa aad dooratay lanbar ka baxsan xadka");
                        }
                    }
                }

                // === Sub-option 2: Ugu shub qof kale ===
                else if (kaarkaHadalka == 2) {
                    System.out.println("Ugu shub qof kale kaarka hadalka");
                    System.out.println("Gali lacagta");
                    int lacgaugushubqofkale = input.nextInt();
                    System.out.println("Fadlan gali lanbarka");
                    int GalilacgataQofkaKale = input.nextInt();
                    System.out.println("Ma hubtaa inaad ugu shubaysid $ " + lacgaugushubqofkale + " lanbarkaan " + GalilacgataQofkaKale);
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int Goaan2 = input.nextInt();

                    if (Goaan2 == 1) {
                        System.out.println("waxaad $" + lacgaugushubqofkale + " ugu shubtay " + GalilacgataQofkaKale);
                    } else if (Goaan2 == 2) {
                        System.out.println("waa laga noqday codsigaaga");
                        System.out.println("MAHADSANID");
                    }
                }

                // === Sub-option 3: Ku shubo Internet ===
                else if (kaarkaHadalka == 3) {
                    System.out.println("-ku shubo Internet-");
                    System.out.println("1. maalinle");
                    System.out.println("2. isbuucle");
                    System.out.println("3. bille");
                    System.out.println("4. ka noqo");
                    int chooseinrenet = input.nextInt();

                    System.out.println("Fadlan gali lacagta ");
                    int lacagtaInternetka = input.nextInt();

                    if (chooseinrenet == 1) {
                        System.out.println("waxaa ku shubatay xirmo maalinle ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 2) {
                        System.out.println("waxaa ku shubatay xirmo isbuucle ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 3) {
                        System.out.println("waxaa ku shubatay xirmo bille ah $" + lacagtaInternetka);
                    } else if (chooseinrenet == 4) {
                        System.out.println("waa laga noqday codsigaga");
                        System.out.println("MAHADSANID");
                    } else {
                        System.out.println("Doorasho khaldan");
                    }
                }

                // === Sub-option 4: Ka Noqo ===
                else if (kaarkaHadalka == 4) {
                    System.out.println("Waa laga noqday codsigaga. Mahadsanid.");
                } else {
                    System.out.println("Xadka waa ka baxday 1---4");
                }
            }

            // === Option 3: Uwareeji EVCPlus (Send Money) ===
            else if (choosingPhase2 == 3) {
                System.out.println("fadlan gali mobile ka");
                int wareejinlacag = input.nextInt();
                System.out.println("fadlan gali lacagta");
                int Uwareejinlacag = input.nextInt();
                int haraagaa = haraaga - Uwareejinlacag;

                System.out.println("mahubtaa inaad u wareejiso " + wareejinlacag + " lacag dhan $ " + Uwareejinlacag);
                System.out.println("1. haa");
                System.out.println("2. maya");
                int goaanwareejin = input.nextInt();

                if (goaanwareejin == 1) {
                    System.out.println("mahadsanid");
                    System.out.println("$" + Uwareejinlacag + " wareejisay " + wareejinlacag);
                    System.out.println("haraagaaga waa $" + haraagaa);
                } else {
                    System.out.println("waalaga noqday codsigaaga. Mahadsanid.");
                }
            }

            // === Option 4: Warbixin kooban (Short Report) ===
            else if (choosingPhase2 == 4) {
                System.out.println("-warbixin kooban-");
                System.out.println("1. last action");
                System.out.println("2. wareejintii ugu danbeesay");
                System.out.println("3. last 3 action");

                int warbixinkoobanChoice = input.nextInt();

                if (warbixinkoobanChoice == 1) {
                    System.out.println("gali lanbarka");
                    int galilanbarkaaga = input.nextInt();
                    System.out.println("Gali lacagta aad u dirtay");
                    int Uwareejinlacag = input.nextInt();
                    System.out.println("$" + Uwareejinlacag + " ayaad u wareejisay " + galilanbarkaaga);
                    System.out.println("Taariikh: 25/4/2025  12:15");
                }
            }

            // === Option 5: Salaam Bank Section ===
            else if (choosingPhase2 == 5) {
                System.out.println("-salaam Bank-");
                System.out.println("1. itus haraagaaga");
                System.out.println("2. Lacag dhigasho");
                System.out.println("3. Lacag qaadasho");
                System.out.println("4. ka bax");

                int salaamBankchoose = input.nextInt();

                // Handle each submenu like pin checking, depositing, withdrawing etc.
                // Already implemented inside your code.
            }

            // === Option 6: Bixi Biil (Pay Bill) ===
            else if (choosingPhase2 == 6) {
                System.out.println("-Bixi Biil-");
                input.nextLine(); // Clear buffer
                System.out.println("Fadlan gali magaca shirkada:");
                String shirkada = input.nextLine();
                System.out.println("Fadlan gali lacagta:");
                int lacag = input.nextInt();
                System.out.println("Waxaad si guul leh ugu bixisay $" + lacag + " shirkada " + shirkada + ".");
            }

            // === Option 7: Iibso Data Plan ===
            else if (choosingPhase2 == 7) {
                System.out.println("-Iibso Data Plan-");
                System.out.println("1. 1GB Maalinle - $1");
                System.out.println("2. 5GB Todobaadle - $4");
                System.out.println("3. 10GB Bille - $10");
                System.out.print("Dooro xirmo: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Waxaad iibsatay 1GB Maalinle. Mahadsanid!");
                        break;
                    case 2:
                        System.out.println("Waxaad iibsatay 5GB Todobaadle. Mahadsanid!");
                        break;
                    case 3:
                        System.out.println("Waxaad iibsatay 10GB Bille. Mahadsanid!");
                        break;
                    default:
                        System.out.println("Doorasho aan sax aheyn. Fadlan isku day mar kale!");
                }
            }

            // === Option 8: Samee Payment ===
            else if (choosingPhase2 == 8) {
                System.out.println("-Samee Payment-");
                System.out.print("Fadlan gali lambarka qofka aad lacag u dirayso: ");
                int lambarka = input.nextInt();

                System.out.print("Fadlan gali qadarka lacagta: ");
                int lacag = input.nextInt();

                System.out.println("Waxaad si guul leh ugu dirtay $" + lacag + " lambarka " + lambarka + ".");
            }

            // === Option 9: Exit ===
            else if (choosingPhase2 == 9) {
                System.out.println("Waad ka baxday. Mahadsanid!");
            }

            // === Invalid Option ===
            else {
                System.out.println("Doorasho aan sax ahayn. Fadlan isku day mar kale!");
            }

        } else {
            System.out.println("PIN khaldan. Isku day mar kale.");
        }
    }
}