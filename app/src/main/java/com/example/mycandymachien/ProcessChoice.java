package com.example.mycandymachien;

 class ProcessChoice {

     String gettingCandy(String candy)
    {
        String foundChoice;
        switch(candy)
        {
            case "gumball":
                foundChoice = "Gumball";
                break;

            case "gum":
                foundChoice = "Gum";
                break;

            case "gummies":
                foundChoice = "Gummies";
                break;

            case "Nerds Candy":
                foundChoice = "Nerds Candy";
                break;

            default:
                foundChoice = "Please pick a candy";
                break;


        }

        return foundChoice;
    }
}
