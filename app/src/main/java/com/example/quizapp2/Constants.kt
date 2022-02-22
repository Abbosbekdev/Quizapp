package com.example.quizapp2

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_question"
    const val CORRECT_ANSWER : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // question 1
        val que1 = Question(1,
            "What country does this flag belong to?",
        R.drawable.argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)
        questionList.add(que1)

        //question 2
        val que2 = Question(2,
            "What country does this flag belong to?",
            R.drawable.uzbekistan,
            "Argentina",
            "Brazil",
            "Russia",
            "Uzbekistan",
            4)
        questionList.add(que2)

        //question 3
        val que3 = Question(3,
            "What country does this flag belong to?",
            R.drawable.russia,
            "USA",
            "UK",
            "Russia",
            "Germany",
            3)
        questionList.add(que3)

        //question 4
        val que4 = Question(4,
            "What country does this flag belong to?",
            R.drawable.brazil,
            "Argentina",
            "Brazil",
            "Mexico",
            "Germany",
            2)
        questionList.add(que4)

        //question 5
        val que5 = Question(5,
            "What country does this flag belong to?",
            R.drawable.iran,
            "Argentina",
            "Brazil",
            "Iran",
            "Turkey",
            3)
        questionList.add(que5)

        //question 6
        val que6 = Question(6,
            "What country does this flag belong to?",
            R.drawable.kyrgyzstan,
            "Kyrgyzstan",
            "Uzbekistan",
            "India",
            "Turkey",
            1)
        questionList.add(que6)


        //question 7
        val que7 = Question(7,
            "What country does this flag belong to?",
            R.drawable.kazakhstan,
            "France",
            "Kazakhstan",
            "China",
            "Italy",
            2)
        questionList.add(que7)

        //question 8
        val que8 = Question(8,
            "What country does this flag belong to?",
            R.drawable.turkey,
            "France",
            "India",
            "Turkey",
            "Italy",
            3)
        questionList.add(que8)

        //question 8
        val que9 = Question(9,
            "What country does this flag belong to?",
            R.drawable.china,
            "Turkey",
            "USA",
            "India",
            "China",
            4)
        questionList.add(que9)

        //question 8
        val que10 = Question(10,
            "What country does this flag belong to?",
            R.drawable.usa,
            "Uzbekistan",
            "USA",
            "India",
            "China",
            2)
        questionList.add(que10)

        return questionList
    }
}