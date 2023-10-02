package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.widget.Toast;

public class suggestion1 extends AppCompatActivity {


    //Data member declaration
    private String score;

    private String strength, weakness;

    private int lowscore, highscore;

    //Object declaration

    //analysisData obj;
    SignupData signupData = new SignupData(this);


    //Textview and Button declaration
    private Button myAnalysisButton;

    String result = "";
    TextView finalscore;
    TextView low, high;
    String Email, Password;
    TextView opinionview;

    String opinion []= new String[6];
    String category[] = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion1);
        //obj = new analysisData(this);

        Intent intent = getIntent();
        String temp;
        temp = intent.getStringExtra("score");
        String category[] = {"Autonomy", "Environmental Mastery", "Personal Growth", "Positive Relations with Others", "Purpose in Life", "Self-Acceptance"};
        String[] catscore = temp.split("-", 8);
            strength= category[0];
            weakness= category[0];
            lowscore= Integer.parseInt(catscore [0]);
            highscore= Integer.parseInt(catscore[0]);
            Email = catscore[6];
            Password = catscore[7];
        Toast.makeText(suggestion1.this, "Email"+ Email, Toast.LENGTH_SHORT).show();

        for (int i = 0; i < 6; i++) {
            result += category[i] + " = " + catscore[i] + "\n\n";
            int s = Integer.parseInt(catscore[i]);
            if ( s > highscore)
            {
                highscore= s;
                strength=category[i];
            }
            if ( s < lowscore)
            {
                lowscore =s;
                weakness=category[i];
            }


        }
        finalscore = findViewById (R.id.textView2);
        finalscore.setText(result);
        // display high and low values
        String highvalue = "Your strength is " + strength + " as your score is " + highscore + "\n\n";
        String lowvalue = "Your weakness is " + weakness + " as your score is " + lowscore + "\n\n";
        //obj.updateUser(emailid, weakness);

        high = findViewById (R.id.textView8);
        high.setText(highvalue);

        low = findViewById (R.id.textView10);
        low.setText(lowvalue);
        //analysisData obj2 = new analysisData(this);
        //obj2.updateUser(Email, weakness);
        String catty[] = {"Autonomy", "Environmental Mastery", "Personal Growth", "Positive Relations with Others", "Purpose in Life", "Self-Acceptance"};

        opinion[0]=" Kant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic values. Kant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic valuesKant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic values";

        opinion[1]="Marx argued that individuals should have control over their environments, particularly the means of production. By understanding societal structures and advocating for a world where workers have control, individuals can achieve a greater mastery over their environments. Marx’s advocacy for control over one's surroundings, especially in the socio-economic context, underscores the importance of environmental mastery. By understanding and challenging societal structures, one can seek to create environments that align with their values and aspirations. Marx's philosophy encourages proactive engagement with one's surroundings to foster conditions conducive to well-being.";

        opinion[2]="Nietzsche believed in the will to power and the idea of overcoming oneself. By challenging societal norms, embracing adversity, and striving for individual growth, one can transcend their limitations and achieve greatness. Nietzsche championed the idea of self-overcoming and personal evolution. By challenging societal norms and embracing adversity, individuals can continually reinvent themselves. Nietzsche's philosophy encourages boldness, self-questioning, and a continuous striving towards self-improvement and actualization";

        opinion[3]="Aristotle believed that social relations, especially friendships, play a central role in achieving eudaimonia. Different types of friendships, based on utility, pleasure, and virtue, enrich our lives in different ways. A life in communion with others, based on mutual respect and understanding, contributes significantly to our well-being. Aristotle believed that true happiness (eudaimonia) is often realized in the company of good friends. By understanding the various types of friendships and their significance, one can foster meaningful relationships. Building bonds based on mutual respect, understanding, and virtue can significantly enhance interpersonal relations and communal well-being.";

        opinion[4]="Sartre's existentialism posits that life has no inherent meaning. Instead, individuals must create their own essence and purpose. This realization can be liberating, as it means you have the freedom to determine your path and the meaning of your existence. Sartre’s existentialism proclaims that life lacks inherent meaning; it's up to individuals to craft their own. This realization can empower individuals to actively seek and define their unique purpose. By taking responsibility for one's actions and choices, individuals can craft a life imbued with personal significance and intentionality.";

        opinion[5]="The teachings of Gautama Buddha emphasize recognizing and accepting the impermanent nature of the self and the world. Self-acceptance comes from understanding the causes of suffering and embracing the path to enlightenment. By meditating on the nature of the self and detaching from worldly desires, one can achieve a deeper understanding and acceptance of oneself. The Buddha emphasized mindfulness and meditation, which can pave the way to self-acceptance. By following the Eightfold Path, individuals can confront and understand the roots of their suffering, thereby realizing their intrinsic worth. Detachment from worldly desires and recognizing the impermanence of life can cultivate an inner peace, allowing one to embrace oneself wholly, flaws and all";

        opinionview=findViewById(R.id.textView20);

        for (int i=0; i<6; i++ )
{
if (weakness.equalsIgnoreCase(catty [i]))
{
    opinionview.setText(opinion [i]);
}

}
        myAnalysisButton = (Button) findViewById(R.id.button7);

        myAnalysisButton.setOnClickListener(new View.OnClickListener()
        {
            // defining the event click action procedure
            @Override
            public void onClick(View v)
            {

                openhome();
            }

        });
    }
        public void openhome () {

            try {
                signupData.updateUser(Email, strength, weakness);

                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);


            }
            catch (Exception e1) {

                Toast.makeText(this, "error is" + e1, Toast.LENGTH_SHORT).show();
            }
        }


    }


    //String a = signupData.getanalysis("environment");
    //openAnalysis(a);