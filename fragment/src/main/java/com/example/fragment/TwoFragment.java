package com.example.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class TwoFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(android.R.drawable.ic_dialog_alert);    //  안드로이드 내부 아이콘
        builder.setTitle("DialogFragment");
        builder.setMessage("DialogFragment 의 내용이 잘 보이나요?~");
        builder.setPositiveButton("OK",null);

        AlertDialog dialog = builder.create();              // 메서드 생성
        return dialog;
    }
}
