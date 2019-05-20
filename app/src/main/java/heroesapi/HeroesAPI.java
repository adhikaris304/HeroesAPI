package heroesapi;

import java.util.List;

import model.Heroes;
import model.HeroesResponse;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface HeroesAPI {


    @POST("heroes")
    Call<Void> addHero (@Body Heroes heroes);

    @Multipart
    @POST("upload")
    Call<HeroesResponse> uploadImage(@Part MultipartBody.Part img);

    @GET("heroes")
    Call<List<Heroes>> getAllHeroes();
}
