package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import java.util.Random;
import android.widget.TextView;


public class thought extends AppCompatActivity {

    //object declare for button and TextView

    Button Homebutton;
    TextView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought);

        // Defining the event click action procedure for "Home" button.

        Homebutton = (Button) findViewById(R.id.button6);
        Homebutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                openhome();
            }

        });
        display();

    }

    //Directing towards home page.
    public void openhome ()
    {
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);

    }



    // Assigning 30 different quotes in a list of array. This function displays a random text.
    public void display()
        {
            Random random1 = new Random();

            //generating random number between 0 to 29.
            int guess = random1.nextInt(30);
            //msg = message to be displayed.

            String msg[]= new String [30];
            msg[0]="A disciplined mind brings happiness.-Gautama Buddha";
            msg[1]="Delight in meditation and solitude. Compose yourself, be happy. You are a seeker-Gautama Buddha.";
            msg[2]="What we are today comes from our thoughts of yesterday, and our present thoughts build our life of tomorrow: Our life is the creation of our mind.-Gautama Buddha";
            msg[3]="The root of suffering is attachment-Gautama Buddha";
            msg[4]="You cannot travel the path until you have become the path itself-Gautama Buddha.";
            msg[5]="If you are lonely when you're alone, you are in bad company-Jean-Paul Sartre.";
            msg[6]="We are our choices-Jean-Paul Sartre";
            msg[7]="Life has no meaning the moment you lose the illusion of being eternal-Jean-Paul Sartre.";
            msg[8]="In life, a man commits himself, draws his own portrait, and there is nothing but that portrait-Jean-Paul Sartre";
            msg[9]="What is a friend? A single soul dwelling in two bodies-Aristotle";
            msg[10]="The best friend is the man who in wishing me well wishes it for my sake-Aristotle";
            msg[11]="He who has many friends has none-Aristotle";
            msg[12]="he antidote for fifty enemies is one friend-Aristotle";
            msg[13]="You will never do anything in this world without courage. It is the greatest quality of the mind next to honor-Aristotle";
            msg[14]="One must still have chaos in oneself to be able to give birth to a dancing star-Friedrich Nietzsche";
            msg[15]="In oneself lies the whole world, and if you know how to look and learn, the door is there and the key is in your hand. Nobody on earth can give you either the key or the door to open, except yourself-Friedrich Nietzsche.";
            msg[16]="The individual has always had to struggle to keep from being overwhelmed by the tribe. If you try it, you will be lonely often, and sometimes frightened. But no price is too high to pay for the privilege of owning yourself-Friedrich Nietzsche";
            msg[17]="The secret of reaping the greatest fruitfulness and the greatest enjoyment from life is to live dangerously-Friedrich Nietzsche";
            msg[18]="Become who you are-Friedrich Nietzsche";
            msg[19]="Man lives on nature, which means that nature is his body, with which he must remain in continuous interchange if he is not to die. That man's physical and spiritual life is linked to nature means simply that nature is linked to itself, for man is a part of nature-Karl Marx";
            msg[20]="Labour is, in the first place, a process in which both man and Nature participate, and in which man of his own accord starts, regulates, and controls the material re-actions between himself and Nature. He opposes himself to Nature as one of her own forces, setting in motion arms and legs, head and hands, the natural forces of his body, in order to appropriate Nature's productions in a form adapted to his own wants-Karl Marx";
            msg[21]="From the standpoint of a higher economic form of society, private ownership of the globe by single individuals will appear quite as absurd as private ownership of one man by another-Karl Marx";
            msg[22]="Workers of the world, unite! You have nothing to lose but your chains-Karl Marx";
            msg[23]="Religion is the opium of the masses-Karl Marx";
            msg[24]="Autonomy is that the maxims of the action were given by the will itself and not by any interest-Immanuel Kant";
            msg[25]="Freedom is that property of a causality of the will by which it can be effective independently of foreign causes determining it; for by this causality, freedom is the ratio of autonomy, that is, of the will's property to be a law to itself-Immanuel Kant";
            msg[26]="The will is therefore the subject of moral law, which is autonomy, and is determined by this law to actions which are also, on that account, called moral, that is, actions which are possible in the presence of freedom and in accordance with this law-Immanuel Kant";
            msg[27]="All moral concepts have their seat and origin completely a priori in reason, and, nevertheless, their business is with feeling, as its effect, and for this reason it can and must be a matter of the highest moment to determine the source of this feeling, that is, how it comes to be excited, although it does not arise from it-Immanuel Kant";
            msg[29]=" Those who know, do. Those who understand, teach- Aristotle";
            msg[29]="Act in such a way that you treat humanity, whether in your own person or in the person of any other, never merely as a means to an end, but always at the same time as an end-Immanuel Kant";

            // Displaying the message.
            quote = findViewById(R.id.textview14);
            // Extracting the random text/message to be displayed.
            String s = msg [guess];
            quote.setText(s);
        }




}
