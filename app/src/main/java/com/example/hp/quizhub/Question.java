package com.example.hp.quizhub;

public class Question {

    private String mQuestions[]={
            "How many digits are there in Hindu-Arabic System?",
            "Among the following which natural number has no prodessor?",
            "Which among the following is the largest known number in the world?",
            "What does 1 gogol means?",
            "Among the following which whole number has no prodessore?",
            "Counting numbers are kept under ...........number",
            "An integer that is divisible by 2 is called:",
            "In which number system,there is no symbol for zero?",
            "In Roman numerals M represents 1000, what does M represent?",
            "What does D represent in Roman numeral system?",
            "The whole number is denoted by ..............",
            "Rational number is represnted by .............",
            "Integers are represnted by .............",
            "All counting numbers,together with their negatives and zeros constitute the set of......... ",
            "A number which is expressed as a+ib,where a and b are real are called:",
            "An integer p which is not 0 or +1 and is divisible by no integer expect +1 and itself is called:",
            "p,p+2,p+4 are called .............if all number are primes",
            "The cube root of 27 connected with units of angle measurement will produce......... musical act?",
            "A number only divisible by itself and one has inspired Joe Mac Anthony to title one of his works.What was the title of his work?"


    };

    private String mChoices[][]={

            {"10","20","30"},
            {"100","200","1"},
            {"googol","googolpex","gram"},
            {"1 followed by hundred zeros","1 followed by thousand zeros","1 followed by ten thousand and zeros"},
            {"-1","0","1"},
            {"Natural","Whole","Rational"},
            {"Even number","Natural number","Odd number"},
            {"Hindu Arabic system","Roman","Egyptian"},
            {"10,000","50,000","10,00,000"},
            {"100","500","1000"},
            {"V","MMMMM","MX"},
            {"N","R","W"},
            {"N","Z","R"},
            {"Whole number","Real number","Integers"},
            {"Rational number","Irrational number","Complex number"},
            {"Rational number","Perfect number","Prime number"},
            {"Pythagonal Triplet","Prime Triplet","Lucas number"},
            {"Three Degrees","The Square","The Rule of three"},
            {"Prime Target","The Perfect Ten","The Amicable"}
    };

    private String mCorrectAnswers[]={"10","1","googolplex","1 followed by hundred zeros","0","Natural","Even number",
            "Roman","10,000","500","V","W","R","Z","Integers","Complex number","Prime number","Prime Triplet","The Three Degree","Prime Target"};

    public String getQuestion(int a){
        String question=mQuestions[a];

        return question;
    }



    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){

        String answer=mCorrectAnswers[a];
        return answer;
    }


}
