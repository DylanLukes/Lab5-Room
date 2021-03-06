package edu.ucsd.cse110.lab5_room;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;

import java.util.Optional;

public class Utilities {
    public static void showAlert(Context context, String message) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);

        alertBuilder
                .setTitle("Alert!")
                .setMessage(message)
                .setPositiveButton("Ok", (dialog, id) -> {
                    dialog.cancel();
                })
                .setCancelable(true);

        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }

    public static Optional<Integer> parseCount(String str) {
        try {
            int maxCount = Integer.parseInt(str);
            return Optional.of(maxCount);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
