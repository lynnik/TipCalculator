package com.lynnik.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends Activity {

  private static final NumberFormat currencyFormat =
      NumberFormat.getCurrencyInstance();
  private static final NumberFormat percentFormat =
      NumberFormat.getPercentInstance();

  private double billAmount = 0.0;
  private double percent = 0.15;
  private TextView amountTextView;
  private TextView percentTextView;
  private TextView tipTextView;
  private TextView totalTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    amountTextView = (TextView) findViewById(R.id.amountTextView);
    percentTextView = (TextView) findViewById(R.id.percentTextView);
    tipTextView = (TextView) findViewById(R.id.tipTextView);
    totalTextView = (TextView) findViewById(R.id.totalTextView);

    tipTextView.setText(currencyFormat.format(0));
    totalTextView.setText(currencyFormat.format(0));

    EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
    amountEditText.addTextChangedListener();

    SeekBar percentSeekBar = (SeekBar) findViewById(R.id.percentSeekBar);
    percentSeekBar.setOnSeekBarChangeListener();
  }
}
