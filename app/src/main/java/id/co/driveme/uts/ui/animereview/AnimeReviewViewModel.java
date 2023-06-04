package id.co.driveme.uts.ui.animereview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnimeReviewViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AnimeReviewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Anime Review fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}