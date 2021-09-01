package com.ranzan.retrofitimageupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Headers("Authorization: Client-ID a12c5bcbb903772")
    @Multipart
    @POST("3/image")
    Call<ResponseDTO> uploadImage(
            @Part MultipartBody.Part image
    );
}
