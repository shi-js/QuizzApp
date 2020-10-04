package com.example.quizzapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
       val questionList = ArrayList<Question>()

        val ques1 = Question(
            1,
            "What kind of wizard is Lucy in Fairy Tail Anime?",
        R.drawable.lucy,
            "Ice Wizard",
            "Fire Wizard",
            "Celestial Wizard",
            "Dark Wizard",
            3
        )

        questionList.add(ques1)


        val ques2 = Question(
            1,
            "Which of the following characters does the “Gum-Gum Pistol” attack belong to?",
            R.drawable.luffy,
            "Goku",
            "Natsu",
            "Deku",
            "Monkey D. Luffy",
            4
        )

        questionList.add(ques2)


        val ques3 = Question(
            1,
            "Naruto has different types of modes. Do you know what is the name of this mode?",
            R.drawable.nauto,
            "Kurama Chakra Mode",
            "Six Paths Mode",
            "None of them",
            "All of them",
            2
        )

        questionList.add(ques3)


        val ques4 = Question(
            1,
            "This picture is from which one of these famous anime\'s?",
            R.drawable.sa,
            "Spirited Away",
            "Pokemon",
            "Gundam",
            "Kung Fu Panda",
            1
        )

        questionList.add(ques4)
        return questionList
    }
}