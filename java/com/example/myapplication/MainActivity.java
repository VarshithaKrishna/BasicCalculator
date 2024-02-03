package com.example.myapplication;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
      char ACTION;
      double val1 = Double.NaN;
      double val2;
    final char ADDITION = '+';
    final char SUBTRACTION = '-';
    final char MULTIPLICATION = '*';
    final char DIVISION = '/';
    final char EQU = '=';
    final char EXTRA = '@';
    final char MODULUS = '%';
    TextView t1;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button b1;
         Button b2;
         Button b3;
         Button b4;
         Button b5;
         Button b6;
         Button b7;
         Button b8;
         Button b9;
         Button b0;
         Button b_equal;
         Button b_multi;
         Button b_divide;
         Button b_add;
         Button b_sub;
         Button b_clear;
         Button b_dot;
         Button b_para1;
         Button b_para2;
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);
        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        b_para1 = findViewById(R.id.button_para1);
        b_para2 = findViewById(R.id.button_para2);
        t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.output);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifErrorOnOutput();
                exceedLength();
                t1.setText(t1.getText().toString() + "0");

            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                t1.setText(t1.getText().toString() + ".");

            }
        });
       b_para1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   ACTION = MODULUS;
                   operation();
                   if (!ifReallyDecimal()) {
                       t2.setText(val1 + "%");
                   } else {
                       t2.setText((int) val1 + "%");
                   }
                   t1.setText(null);
               }
               else
                   t2.setText("Error");
           }
       });
       b_para2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (!t2.getText().toString().isEmpty() || !t1.getText().toString().isEmpty()) {
                   val1 = Double.parseDouble(t1.getText().toString());
                   ACTION = EXTRA;
                   t2.setText("-" + t1.getText().toString());
                   t1.setText("");
               }
               else {
                   t2.setText("Error");
               }
           }
       });
       b_add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   ACTION = ADDITION;
                   noOperation();
                   operation();
                   if (!ifReallyDecimal()) {
                       t2.setText(val1 + "+");
                   } else {
                       t2.setText((int) val1 + "+");
                   }
                   t1.setText(null);
               } else {
                   t2.setText("Error");
               }
           }
       });
       b_sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   ACTION = SUBTRACTION;
                   noOperation();
                   operation();
                   if (t1.getText().length() > 0)
                       if (!ifReallyDecimal()) {
                           t2.setText(val1 + "-");
                       } else {
                           t2.setText((int) val1 + "-");
                       }
                   t1.setText(null);
               }
               else {
                   t2.setText("Error");
               }

           }
       });
       b_multi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   ACTION = MULTIPLICATION;
                   noOperation();
                   operation();
                   if (!ifReallyDecimal()) {
                       t2.setText(val1 + "×");
                   } else {
                       t2.setText((int) val1 + "×");
                   }
                   t1.setText(null);
               } else {
                   t2.setText("Error");
               }
           }
       });
       b_divide.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   ACTION = DIVISION;
                   noOperation();
                   operation();
                   if (ifReallyDecimal()) {
                       t2.setText((int) val1 + "/");
                   } else {
                       t2.setText(val1 + "/");
                   }
                   t1.setText(null);
               } else {
                   t2.setText("Error");
               }
           }
       });
       b_equal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   operation();
                   ACTION = EQU;
                   if (!ifReallyDecimal()) {
                       t2.setText(/*t2.getText().toString() + String.valueOf(val2) + "=" + */String.valueOf(val1));
                   } else {
                       t2.setText(/*t2.getText().toString() + String.valueOf(val2) + "=" + */String.valueOf((int) val1));
                   }
                   t1.setText(null);
               } else {
                   t2.setText("Error");
               }
           }
       });
       b_clear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (t1.getText().length() > 0) {
                   CharSequence name = t1.getText().toString();
                   t1.setText(name.subSequence(0, name.length() - 1));
               } else {
                   val1 = Double.NaN;
                   val2 = Double.NaN;
                   t1.setText("");
                   t2.setText("");
               }
           }
       });
       b_clear.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               val1 = Double.NaN;
               val2 = Double.NaN;
               t1.setText("");
               t2.setText("");
               return true;
           }
       });
    }
    private void operation() {
        if (!Double.isNaN(val1)) {
            if (t2.getText().toString().charAt(0) == '-') {
                val1 = (-1) * val1;
            }
            val2 = Double.parseDouble(t1.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EXTRA:
                    val1 = (-1) * val1;
                    break;
                case MODULUS:
                    val1 = val1 % val2;
                    break;
                case EQU:
                    break;
            }
        } else {
            val1 = Double.parseDouble(t1.getText().toString());
        }
    }

    private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }

    private boolean ifReallyDecimal() {
        return val1 == (int) val1;
    }
    private void noOperation() {
        String inputExpression = t2.getText().toString();
        if (!inputExpression.isEmpty() && !inputExpression.equals("Error")) {
            if (inputExpression.contains("-")) {
                inputExpression = inputExpression.replace("-", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("+")) {
                inputExpression = inputExpression.replace("+", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("/")) {
                inputExpression = inputExpression.replace("/", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("%")) {
                inputExpression = inputExpression.replace("%", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
            if (inputExpression.contains("×")) {
                inputExpression = inputExpression.replace("×", "");
                t2.setText("");
                val1 = Double.parseDouble(inputExpression);
            }
        }
    }

    private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }
}
