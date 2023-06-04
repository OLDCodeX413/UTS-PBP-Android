package id.co.driveme.uts.ui.animelist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnimeListViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AnimeListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Anime List fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}