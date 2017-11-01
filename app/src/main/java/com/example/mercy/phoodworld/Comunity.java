package com.example.mercy.phoodworld;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Comunity.OnFragmentInteractionListener} interface
 * to handle interaction events.
 //* Use the {@link Comunity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Comunity extends Fragment  {
    private String title;
    private String message;
    private String timestamp;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Comunity() {
        // Required empty public constructor
    }

//    public Comunity(String title,String message,String timestamp){
//        this.title = title;
//        this.message = message;
//        this.timestamp = timestamp;
//   }
//
//
//    public String getTitle(){
//        return title;
//    }
//    public String getMessage(){
//        return message;
//    }
//    public String getTimestamp(){
//        return timestamp;
//    }
//    public void setTitle(String name){
//        this.title = name;
//    }
//    public void setMessage(String message){
//
//        this.message = message;
//    }
//    public void setTimestamp(String timestamp){
//        this.timestamp = timestamp;
//    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param title Parameter 1.
     * @param message Parameter 2.
     * @return A new instance of fragment Comunity.
     */
    // TODO: Rename and change types and number of parameters

    public static Comunity newInstance(String title, String message, String timestamp) {


        Comunity fragment = new Comunity();
        Bundle args = new Bundle();
        args.putString("Burned Food", title);
        args.putString("This is not working.I don't know what to do...", message);
        args.putString("11:40 am", timestamp);
        args.putString("Burned Food", title);
        args.putString("This is not working.I don't know what to do...", message);
        args.putString("11:40 am", timestamp);
        args.putString("Burned Food", title);
        args.putString("This is not working.I don't know what to do...", message);
        args.putString("11:40 am", timestamp);
        args.putString("Burned Food", title);
        args.putString("This is not working.I don't know what to do...", message);
        args.putString("11:40 am", timestamp);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString("Burned Food");
            message = getArguments().getString("This is not working.I don't know what to do...");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comunity, container, false);

//        Bundle bundle = getArguments();
//
//        String [] myString = bundle.getStringArray("jdlf");
//

       // cRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
