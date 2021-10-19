package com.blackseapps.interview.data.network;

import com.blackseapps.interview.data.network.model.Category;
import com.blackseapps.interview.data.network.model.Product;
import com.google.firebase.database.DatabaseReference;

import io.reactivex.Single;

/**
 * Created by mertKaradeniz on 19.10.2021
 * <p>
 * This is an interview project.
 */

public interface ApiHelper {

    DatabaseReference getProductApiCall();

    DatabaseReference getCategoryApiCall();

    Single<Product> setProductApiCall(Product product);

    Single<Category> setCategoryApiCall(Category category);

}