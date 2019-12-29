package com.example.quiz;

public class Question {

    private int trueAnswer;
    private int falseAnswer;
    private int answeredQuestions;

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getFalseAnswer() {
        return falseAnswer;
    }

    public int getAnsweredQuestions() {
        return answeredQuestions;
    }

    public void setAnsweredQuestions(int answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }

    public void setFalseAnswer(int falseAnswer) {
        this.falseAnswer = falseAnswer;
    }

    public Question() {
        this.trueAnswer = 0;
        this.falseAnswer = 0;
        this.answeredQuestions = 0;
    }

    public String questions[] = {
            "Кто является создателем Linux?",
            "Что из перечисленного неверно?",
            "Какой вариант ябъявления класса неверен?",
            "Выберите правильный вариант ответа",
            "Что такое полиморфизм?",
            "Выберите неправильное утверждение о различии абстрактного класса и интерфейса",
            "Чем является данная конструкция: View.OnClickListener onClick = new View.OnclickListener() { @Ovveride onClick(View v) {} }",
            "Выберите правильно утверждение о модификаторе доступа protected",
            "Какая реализация коллекций лежит в вверху иерархий коллекций?",
            "Чем конструкция ArrayList<String> list = new ArrayList<String>() отличается от конструкции ArrayList list = new ArrayList();"
    };

    public String choices[][] = {
            {"Линус Торвальдс", "Стив Джобс", "Стив Возняк"},
            {"Java-строго типизированный ЯП", "Java-Объектно-ориентированный ЯП", "Java-функциональный ЯП"},
            {"public class Fox extends Animal", "public class Fox implements Animal,Mammal",
                    "public class Fox extends Animal,Mammal"},
            {"Нельзя объявить экземпляр абстрактного класса","У абстрактного класса нельзя объявить контсруктор",
                    "Абстрактный класс может иметь модификатор final"},
            {"Способность одному классу расширять другой класс", "Способность объектов с одним интерфейсом иметь различную реализацию",
                    "Способность имплементировать интерфейс"},
            {"Интерфейс описывает только поведение", "Мы можем наследовать только один класс",
                    "Абстракный класс может быть реализован разными классами"},
            {"Анонимный класс", "Анонимный интерфейс","Анонимная функция"},
            {"Виден всем классам из текущего пакета и из внешних", "Виден только в текущем пакете",
                    "Доступен в текущем классе и любом производном классе из любого пакета"},
            {"Map", "Collection","List"},
            {"Конструкции идентичны", "В обоих вариантах можно хранить любые переменные","В первом варианте можно хранить только переменные типа String"}

    };

    public String correctAnswer[] = {
            "Линус Торвальдс",
            "Java-функциональный ЯП",
            "public class Fox extends Animal,Mammal",
            "Нельзя объявить экземпляр абстрактного класса",
            "Способность объектов с одним интерфейсом иметь различную реализацию",
            "Абстракный класс может быть реализован разными классами",
            "Анонимный класс",
            "Доступен в текущем классе и любом производном классе из любого пакета",
            "Collection",
            "В первом варианте можно хранить только переменные типа String"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }


    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

    public String getChoices(int a, int b) {
        return choices[a][b];
    }

    public int getLengthQuestions() {
        return questions.length;
    }
}