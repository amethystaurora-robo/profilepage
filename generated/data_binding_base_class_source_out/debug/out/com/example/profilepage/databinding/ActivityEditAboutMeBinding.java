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
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditAboutMeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView aboutmetext;

  @NonNull
  public final TextInputEditText textInputEditText;

  @NonNull
  public final Button update;

  private ActivityEditAboutMeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView aboutmetext, @NonNull TextInputEditText textInputEditText,
      @NonNull Button update) {
    this.rootView = rootView;
    this.aboutmetext = aboutmetext;
    this.textInputEditText = textInputEditText;
    this.update = update;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditAboutMeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditAboutMeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_about_me, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditAboutMeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.aboutmetext;
      TextView aboutmetext = rootView.findViewById(id);
      if (aboutmetext == null) {
        break missingId;
      }

      id = R.id.textInputEditText;
      TextInputEditText textInputEditText = rootView.findViewById(id);
      if (textInputEditText == null) {
        break missingId;
      }

      id = R.id.update;
      Button update = rootView.findViewById(id);
      if (update == null) {
        break missingId;
      }

      return new ActivityEditAboutMeBinding((ConstraintLayout) rootView, aboutmetext,
          textInputEditText, update);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}