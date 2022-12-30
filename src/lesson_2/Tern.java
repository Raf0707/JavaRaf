package lesson_2;

/**
 * Тернарный оператор представляет собой однострочную запись конструкции if-else
 * Вначале пишется условие, затем ?, затем тело метода, если это условие выполняется,
 * затем : и затем тело метода, если это условие не выполняется
 *
 * В конце представлен пример конструкции switch-case,
 * о ней я более подробно расскажу в вебинаре по Android
 */
public class Tern {
    public static void main(String[] args) {
        int n = 10;
        // (условие) ? [выражение если true] : [выражение если false]
        System.out.println((n > 0) ? "EEE" : "fff");


        // switch-case
        /*
        public class MainActivity extends AppCompatActivity implement
                                                View.OnClickListener {

            private Button b;

            onCreate {
            b = findViewById(R.id.button);
            }

            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.button:
                        counter++;
                    case R.id.textview:
                        Intent intent = new Intent(MainActivity.this,
                        SettingsActivity.class);
                        stsrtActivity(intent);
                }
            }
        }
        */
    }
}
