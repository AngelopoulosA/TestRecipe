package com.example.anna.testrecipe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna on 01.01.2017.
 */

public class Add_Recipe_fragment extends Fragment {

    private String title;
    private String photo;
    private String description;
    private String preparation;
    private List<Ingredient> ingredient = new ArrayList<>();
    private String ingredientTitle;
    private String ingredientQuantity;
    private List <String> Categories;
    private String newCategory;
    Toast toast;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_add_recipe, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn = (Button) view.findViewById(R.id.add_ingredients_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText answer = (EditText) view.findViewById(R.id.incredient);
                ingredientTitle = answer.getText().toString();
                ingredientQuantity = ((EditText) view.findViewById(R.id.quantity)).getText().toString();
                Ingredient ingr = new Ingredient(ingredientTitle, ingredientQuantity);
                toast = Toast.makeText( view.getContext(),ingr.toString(), Toast.LENGTH_LONG);
                ingredient.add(new Ingredient(ingredientTitle, ingredientQuantity  ));
                toast.show();
            }
        });

        Button btnAddRecipe = (Button) view.findViewById(R.id.addRecipe);
        btnAddRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = ((EditText) view.findViewById(R.id.editText3)).toString();

            }
        });
        getActivity().setTitle("Add recipe");
    }
}
