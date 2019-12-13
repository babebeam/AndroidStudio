package com.examplebb.project1_dressup01;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

//import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.Toast;

import androidx.fragment.app.Fragment;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

    private static final String TAG = "SignInFragment";
    private LoginButton loginButton;
//    private CircleImageView circleImageView;
//    private TextView txtName,txtEmail;

    private CallbackManager callbackManager;

    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signin, container, false);

        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton) view.findViewById(R.id.login_button);
        loginButton.setReadPermissions("user_friends");
        loginButton.setFragment(this);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Toast.makeText(getActivity(), "Login successful", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(getActivity(), "Login canceled", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                Toast.makeText(getActivity(), "Login error", Toast.LENGTH_SHORT).show();
            }
        });
        return inflater.inflate(R.layout.fragment_signin, container, false);



    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        loginButton = findViewById(R.id.login_button);
//        txtName = findViewById(R.id.profile_name);
//        txtEmail = findViewById(R.id.profile_email);
//        circleImageView = findViewById(R.id.profile_pic);
//
//        callbackManager = CallbackManager.Factory.create();
//        loginButton.setReadPermissions(Arrays.asList("email","public_profile"));
//        checkLoginStatus();
//
//        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//            @Override
//            public void onSuccess(LoginResult loginResult)
//            {
//
//            }
//
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onError(FacebookException error) {
//
//            }
//        });
//    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        callbackManager.onActivityResult(requestCode,resultCode,data);
//        super.onActivityResult(requestCode, resultCode, data);
//    }
//
//    AccessTokenTracker tokenTracker = new AccessTokenTracker() {
//        @Override
//        protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken)
//        {
//            if(currentAccessToken==null)
//            {
//                txtName.setText("");
//                txtEmail.setText("");
//                circleImageView.setImageResource(0);
//                Toast.makeText(SignInFragment.this,"User Logged out",Toast.LENGTH_LONG).show();
//            }
//            else
//                loadUserProfile(currentAccessToken);
//        }
//    };
//
//    private void loadUserProfile(AccessToken newAccessToken)
//    {
//        GraphRequest request = GraphRequest.newMeRequest(newAccessToken, new GraphRequest.GraphJSONObjectCallback() {
//            @Override
//            public void onCompleted(JSONObject object, GraphResponse response)
//            {
//                try {
//                    String first_name = object.getString("first_name");
//                    String last_name = object.getString("last_name");
//                    String email = object.getString("email");
//                    String id = object.getString("id");
//                    String image_url = "https://graph.facebook.com/"+id+ "/picture?type=normal";
//
//                    txtEmail.setText(email);
//                    txtName.setText(first_name +" "+last_name);
//                    RequestOptions requestOptions = new RequestOptions();
//                    requestOptions.dontAnimate();
//
//                    Glide.with(SignInFragment.this).load(image_url).into(circleImageView);
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//
//        Bundle parameters = new Bundle();
//        parameters.putString("fields","first_name,last_name,email,id");
//        request.setParameters(parameters);
//        request.executeAsync();
//
//    }
//
//    private void checkLoginStatus()
//    {
//        if(AccessToken.getCurrentAccessToken()!=null)
//        {
//            loadUserProfile(AccessToken.getCurrentAccessToken());
//        }
//    }

}
