// Generated by view binder compiler. Do not edit!
package com.example.profilepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.profilepage.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditEmailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView textViewPhone;

  @NonNull
  public final Button update;

  private ActivityEditEmailBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout textInputLayout, @NonNull TextView textViewPhone,
      @NonNull Button update) {
    this.rootView = rootView;
    this.textInputLayout = textInputLayout;
    this.textViewPhone = textViewPhone;
    this.update = update;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditEmailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditEmailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_email, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditEmailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = rootView.findViewById(id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textViewPhone;
      TextView textViewPhone = rootView.findViewById(id);
      if (textViewPhone == null) {
        break missingId;
      }

      id = R.id.update;
      Button update = rootView.findViewById(id);
      if (update == null) {
        break missingId;
      }

      return new ActivityEditEmailBinding((ConstraintLayout) rootView, textInputLayout,
          textViewPhone, update);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
