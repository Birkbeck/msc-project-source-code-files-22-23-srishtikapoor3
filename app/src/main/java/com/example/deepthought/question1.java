package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;



public class question1 extends AppCompatActivity { // data member to store the score of each category.
private int autonomy, environment, personal, relations, purpose, acceptance;
private int qnum; // accessing the question with question number
private int low, high;
private String lowCat, highCat;
RadioButton r1, r2, r3, r4, r5, r6, r7; // to access the radio button with the corresponding value chosen by the user.
    TextView t1;

public question1(){ // constructor function to initialise the data member, 6 dimensions of Ryff's Model.
    autonomy= 0;
    environment= 0;
    personal= 0;
    relations= 0;
    purpose= 0;
    acceptance= 0;
    qnum=0;
    lowCat="";
    highCat="";
}

public void showResult (){
    String opinion [][]= new String[6][2]; // assigning the opinion of low score and high score of each category with matrix
    opinion[0][0] ="low autonomy";
    opinion[0][1] = "high autonomy";
    opinion[1][0] ="low environment";
    opinion[1][1] = "high environment";
    opinion[2][0] ="low personal";
    opinion[2][1] = "high personal";
    opinion[3][0] ="low relations";
    opinion[3][1] = "high relations";
    opinion[4][0] ="low purpose";
    opinion[4][1] = "high purpose";
    opinion[5][0] ="low acceptance";
    opinion[5][1] = "high acceptance";
    int point [] = new int[6]; // assigning the calculated score of each category
    point [0]= autonomy;
    point [1]= environment;
    point [2]= personal;
    point [3]= relations;
    point [4]= purpose;
    point [5]= acceptance;
    int i, lowIndex, highIndex; // finding the highest and lowest value relating to the corresponding index
    low = point [0];
    lowIndex =0;
    high = point [0];
    highIndex = 0;
    for(i = 1; i<6 ; i++) // finding the highest and lowest values from all categories with index
    {
        if (point [i]< low )
        {
            low = point[i];
            lowIndex= i;
        }
        else if (point[i]> high)
        {
            high = point [i];
            highIndex = i;
        }



    }
    low = lowIndex;
    high= highIndex;

}


    // Assigning Scoring and questionnaire dependant on Ryff's 6 dimensional model.
public void calculateScore (int num, int value){
    if( num ==1 || num == 13 || num == 24 || num == 35 || num == 41 || num == 10 || num == 21 )
    { autonomy += value ;}
    else if( num ==3 || num == 15 || num == 26 || num == 36 || num == 42 || num == 12 || num == 23 )
    { environment += value;}
    else if( num ==5 || num == 17 || num == 28 || num == 37 || num == 2 || num == 14 || num == 25 )
    {personal += value;}
    else if( num ==7 || num == 18 || num == 30 || num == 38 || num == 4 || num == 16 || num == 27 )
    { relations  +=value;}
    else if( num ==9 || num == 20 || num == 32 || num == 39 || num == 6 || num == 29 || num == 33 )
    {purpose +=value;}
    else if( num ==11|| num == 22 || num == 34 || num == 40 || num == 8 || num == 19 || num == 31 )
    {acceptance +=value;}


}
    // assigning each question as an element in a array;
public String getQuestion(int i ){
 String question []= new String[50];
    question [0] = "1.I am not afraid to voice my opinions, even when they are in opposition to the opinions of most people.";
    question [1] = "2.For me, life has been a continuous process of learning, changing, and growth.";
    question [2]="3.In general, I feel I am in charge of the situation in which I live.";
    question [3]="4.People would describe me as a giving person, willing to share my time with others.";
    question [4]="5.I am not interested in activities that will expand my horizons.";
    question [5]="6.I enjoy making plans for the future and working to make them a reality.";
    question [6]="7.Most people see me as loving and affectionate.";
    question [7]="8. In many ways I feel disappointed about my achievements in life.";
    question [8]="9. I live life one day at a time and don't really think about the future.";
    question [9]="10. I tend to worry about what other people think of me.";
    question [10]="11. When I look at the story of my life, I am pleased with how things have turned out.";
    question [11]="12. I have difficulty arranging my life in a way that is satisfying to me.";
    question [12]="13. My decisions are not usually influenced by what everyone else is doing.";
    question [13]="14. I gave up trying to make big improvements or changes in my life a long time ago.";
    question [14]="15. The demands of everyday life often get me down.";
    question [15]="16. I have not experienced many warm and trusting relationships with others.";
    question [16]="17. I think it is important to have new experiences that challenge how you think about yourself and the world.";
    question [17]="18. Maintaining close relationships has been difficult and frustrating for me.";
    question [18]="19. My attitude about myself is probably not as positive as most people feel about themselves.";
    question [19]="20. I have a sense of direction and purpose in life.";
    question [20]="21. I judge myself by what I think is important, not by the values of what others think is important.";
    question [21]="22. In general, I feel confident and positive about myself.";
    question [22]="23. I have been able to build a living environment and a lifestyle for myself that is much to my liking.";
    question [23]="24. I tend to be influenced by people with strong opinions.";
    question [24]="25. I do not enjoy being in new situations that require me to change my old familiar ways of doing things.";
    question [25]="26. I do not fit very well with the people and the community around me.";
    question [26]="27. I know that I can trust my friends, and they know they can trust me.";
    question [27]="28. When I think about it, I haven’t really improved much as a person over the years.";
    question [28]="29. Some people wander aimlessly through life, but I am not one of them.";
    question [29]="30. I often feel lonely because I have few close friends with whom to share my concerns.";
    question [30]="31. When I compare myself to friends and acquaintances, it makes me feel good about who I am.";
    question [31]="32. I don’t have a good sense of what it is I’m trying to accomplish in life.";
    question [32]="33. I sometimes feel as if I've done all there is to do in life.";
    question [33]="34. I feel like many of the people I know have gotten more out of life than I have.";
    question [34]="35. I have confidence in my opinions, even if they are contrary to the general consensus.";
    question [35]="36. I am quite good at managing the many responsibilities of my daily life.";
    question [36]="37. I have the sense that I have developed a lot as a person over time.";
    question [37]="38. I enjoy personal and mutual conversations with family members and friends.";
    question [38]="39. My daily activities often seem trivial and unimportant to me.";
    question [39]="40. I like most parts of my personality.";
    question [40]="41. It’s difficult for me to voice my own opinions on controversial matters.";
    question [41]="42. I often feel overwhelmed by my responsibilities.";

    if (i < 42)
        return question [i];
    else
        return "";

}

// design button in the layout linked with user defined object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question01);
        Button next =  (Button) findViewById(R.id.button2);

        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);
        r6 = (RadioButton) findViewById(R.id.radioButton6);
        r7 = (RadioButton) findViewById(R.id.radioButton7);
        t1= (TextView) findViewById(R.id.textView5);

// Calculating scoring dependant on the users choice selected from the give multiple options available.
        if (next != null){
            next.setOnClickListener(it -> {
                    int score = 0;
                    if (r1.isChecked()) {
                        score = 1;
                        next.setEnabled(true);

                    } else if (r2.isChecked()) {
                        score = 2;
                        next.setEnabled(true);

                    } else if (r3.isChecked()) {
                        score = 3;
                        next.setEnabled(true);

                    } else if (r4.isChecked()) {
                        score = 4;
                        next.setEnabled(true);

                    } else if (r5.isChecked()) {
                        score = 5;
                        next.setEnabled(true);

                    } else if (r6.isChecked()) {
                        score = 6;
                        next.setEnabled(true);

                    } else if (r7.isChecked()) {
                        score = 7;
                        next.setEnabled(true);

                    }
// reverse scoring for exceptional questions
                qnum = qnum + 1;
                    if (qnum == 1 || qnum ==2 || qnum ==3 ||qnum ==4 ||qnum ==6 ||qnum ==7 ||qnum ==11 ||qnum ==13 ||qnum ==17 ||qnum ==20 || qnum ==21 || qnum ==22 || qnum ==23 || qnum ==27 || qnum ==29 ||qnum ==31 ||qnum ==35 ||qnum ==36 || qnum ==37 || qnum ==38 || qnum ==40)
                        score = 8-score;
                    if (score == 8 || score ==0)
                    {
                        qnum = qnum-1;
                    }
                    else
                    {

                        calculateScore(qnum , score);
                        if (qnum ==41){
                            next.setText("Finish"); // change the text from "next" to "finish"

                        }
                        if (qnum <= 41)
                        {
                            t1.setText(getQuestion(qnum));
                            r1.setChecked(false);
                            r2.setChecked(false);
                            r3.setChecked(false);
                            r4.setChecked(false);
                            r5.setChecked(false);
                            r6.setChecked(false);
                            r7.setChecked(false);
                        }
                        else
                        {
                            t1.setVisibility(View.INVISIBLE);
                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(View.INVISIBLE);
                            r4.setVisibility(View.INVISIBLE);
                            r5.setVisibility(View.INVISIBLE);
                            r6.setVisibility(View.INVISIBLE);
                            r7.setVisibility(View.INVISIBLE);
                            Intent intent2 = new Intent (this,suggestion1.class); //directing to suggestion1 by clicking "finish"
                            String temp = autonomy + "-"+ environment + "-"+ personal + "-"+ relations + "-"+ purpose + "-"+ acceptance;
                            intent2.putExtra("score", temp);
                            startActivity(intent2);
                            t1.setText("Result");

                        }

                    }

});

        }
    }
}