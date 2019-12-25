package com.sample.foo.samplecalculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sample.foo.samplecalculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char MINUS_FIRST_DEGREE = 'a';
    private static final char SQUARING = 'b';
    private static final char CUBING = 'c';
    private static final char FACTORIAL = 'd';
    private static final char SQUARE_ROOT = 'e';
    private static final char LOGARITHM = 'f';
    private static final char MOD = '%';
    private static final char SINUS = 'h';
    private static final char COSINUS = 'i';
    private static final char NATURAL_LOGARITHM = 'j';
    private static final char EXPONENT_DEGREE = 'k';



    private char CURRENT_ACTION;

    private double valueOne = Double.NaN;
    private double valueTwo;

    private DecimalFormat decimalFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        decimalFormat = new DecimalFormat("#.##########");


        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });

        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });

        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });

        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });

        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });

        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });

        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });
        binding.buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3.14");
            }
        });

        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
                binding.editText.setText(null);
            }
        });

        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
                binding.editText.setText(null);
            }
        });

        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
                binding.editText.setText(null);
            }
        });

        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
                binding.editText.setText(null);
            }
        });

        binding.buttonMinusFirstDegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = MINUS_FIRST_DEGREE;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonSquaring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = SQUARING;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonCubing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = CUBING;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = SQUARE_ROOT;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonLogarithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = LOGARITHM;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = MOD;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "%");
                binding.editText.setText(null);
            }
        });

        binding.buttonSinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = SINUS;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonCosinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = COSINUS;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = FACTORIAL;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonExponentDegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = EXPONENT_DEGREE;
                computeIngeneerCalculation();
                binding.infoTextView.setText(decimalFormat.format(valueOne));
                binding.editText.setText(null);
            }
        });

        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                binding.infoTextView.setText(binding.infoTextView.getText().toString() + decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.editText.getText().length() > 0) {
                    CharSequence currentText = binding.editText.getText();
                    binding.editText.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    binding.editText.setText("");
                    binding.infoTextView.setText("");
                }
            }
        });
    }

    private void computeCalculation() {
        if (!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);

            if (CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if (CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if (CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if (CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
            else if (CURRENT_ACTION == MOD)
                valueOne = (this.valueOne % valueTwo);
        } else {
            try {
                valueOne = Double.parseDouble(binding.editText.getText().toString());
            } catch (Exception e) {
            }
        }
    }

    private void computeIngeneerCalculation() {
        if (Double.isNaN(valueOne)) {
            valueOne = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);
            int result = 1;

            if (CURRENT_ACTION == MINUS_FIRST_DEGREE) {
                valueOne = 1 / this.valueOne;
            } else if (CURRENT_ACTION == SQUARING)
                valueOne = this.valueOne * this.valueOne;
            else if (CURRENT_ACTION == CUBING)
                valueOne = this.valueOne * this.valueOne * this.valueOne;
            else if (CURRENT_ACTION == FACTORIAL){
                for ( int i = 1; i<=this.valueOne; i++){
                    result = result * i;
                }
                valueOne = result;
            }
            else if (CURRENT_ACTION == SQUARE_ROOT)
                valueOne = Math.sqrt(this.valueOne);
            else if (CURRENT_ACTION == LOGARITHM)
                valueOne = Math.log10(this.valueOne);
            else if (CURRENT_ACTION == SINUS)
                valueOne = Math.sin(valueOne);
            else if (CURRENT_ACTION == COSINUS)
                valueOne = Math.cos(this.valueOne);
            else if (CURRENT_ACTION == NATURAL_LOGARITHM)
                valueOne = Math.log(valueOne);
            else if (CURRENT_ACTION == EXPONENT_DEGREE)
                valueOne = Math.exp(this.valueOne);

        }
    }

    public static class FactorialUtil {
        public static int factorial(int n) {
            if (n == 0) return 1;
            return n * factorial(n - 1);
        }
    }
}


