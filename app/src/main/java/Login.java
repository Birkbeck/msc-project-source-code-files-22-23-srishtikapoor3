import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
public class Login extends SQLiteOpenHelper

{

        // Database version and name
        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "DeepThought.db";

        // Table and column details

        public Login(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);

        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String query  = "CREATE TABLE user (emailid text PRIMARY KEY, username text, password text,";
            query += " strenght text, weakness text)";
            db.execSQL(query);
            query = "insert into user values('skapoo2@gmail.com','srishti')";
            db.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS user");
            onCreate(db);
        }
    }




