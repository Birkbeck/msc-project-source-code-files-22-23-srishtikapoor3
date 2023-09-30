package com.example.deepthought;

// SQLite Helper class for creating tables, inserting data, and cross checking credentials for login
import static android.widget.Toast.makeText;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.widget.Toast;


public class analysisData extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DeepThought.db";

    public analysisData (Context context) {
        super (context , DATABASE_NAME , null, DATABASE_VERSION);


    }
    public void onCreate (SQLiteDatabase db) {
        String query = "Create table suggestion(weakness text primary key, opinion text)";
        db.execSQL(query);
        String cat = "autonomy";
        String opinion = " Kant believed in autonomy as a fundamental aspect of moral philosophy. By acting according to reason and a universal moral law, individuals can be truly autonomous and make moral decisions free from external influences. Kant's moral philosophy revolves around autonomy and acting based on rational moral laws. Embracing Kantian ethics can bolster decision-making grounded in personal principles, rather than external pressures. By understanding and adhering to one's moral compass, individuals can cultivate a deep sense of autonomy, ensuring actions and choices resonate with their intrinsic values";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);


        cat = "environment";
        opinion = "Marx argued that individuals should have control over their environments, particularly the means of production. By understanding societal structures and advocating for a world where workers have control, individuals can achieve a greater mastery over their environments. Marx’s advocacy for control over one's surroundings, especially in the socio-economic context, underscores the importance of environmental mastery. By understanding and challenging societal structures, one can seek to create environments that align with their values and aspirations. Marx's philosophy encourages proactive engagement with one's surroundings to foster conditions conducive to well-being.";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);

        cat = "Personal Growth";
        opinion = "Nietzsche believed in the will to power and the idea of overcoming oneself. By challenging societal norms, embracing adversity, and striving for individual growth, one can transcend their limitations and achieve greatness. Nietzsche championed the idea of self-overcoming and personal evolution. By challenging societal norms and embracing adversity, individuals can continually reinvent themselves. Nietzsche's philosophy encourages boldness, self-questioning, and a continuous striving towards self-improvement and actualization.";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);

        cat = "Positive Relations ";
        opinion = "Aristotle believed that social relations, especially friendships, play a central role in achieving eudaimonia. Different types of friendships, based on utility, pleasure, and virtue, enrich our lives in different ways. A life in communion with others, based on mutual respect and understanding, contributes significantly to our well-being. Aristotle believed that true happiness (eudaimonia) is often realized in the company of good friends. By understanding the various types of friendships and their significance, one can foster meaningful relationships. Building bonds based on mutual respect, understanding, and virtue can significantly enhance interpersonal relations and communal well-being.";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);

        cat = " Purpose in life";
        opinion = "Sartre's existentialism posits that life has no inherent meaning. Instead, individuals must create their own essence and purpose. This realization can be liberating, as it means you have the freedom to determine your path and the meaning of your existence. Sartre’s existentialism proclaims that life lacks inherent meaning; it's up to individuals to craft their own. This realization can empower individuals to actively seek and define their unique purpose. By taking responsibility for one's actions and choices, individuals can craft a life imbued with personal significance and intentionality.";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);

        cat = "Self-Acceptance ";
        opinion = "The teachings of Gautama Buddha emphasize recognizing and accepting the impermanent nature of the self and the world. Self-acceptance comes from understanding the causes of suffering and embracing the path to enlightenment. By meditating on the nature of the self and detaching from worldly desires, one can achieve a deeper understanding and acceptance of oneself. The Buddha emphasized mindfulness and meditation, which can pave the way to self-acceptance. By following the Eightfold Path, individuals can confront and understand the roots of their suffering, thereby realizing their intrinsic worth. Detachment from worldly desires and recognizing the impermanence of life can cultivate an inner peace, allowing one to embrace oneself wholly, flaws and all.";
        query = "insert into suggestion values ('" + cat + "','" + opinion + "')";
        db.execSQL(query);

        db.close();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS suggestion");
        onCreate(db);
    }

    }

















