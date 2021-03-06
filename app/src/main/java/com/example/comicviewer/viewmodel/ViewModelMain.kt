package viewmodel


import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.comicviewer.model.comic.Comic
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import repository.RepositoryMarvel


class ViewModelMain : ViewModel() {

    val comicResponse = MutableLiveData<MutableSet<Comic>>()
    private val repositoryMarvel = RepositoryMarvel()

    fun getResponse() = CoroutineScope(IO).launch {
        comicResponse.postValue(repositoryMarvel.getComicService().comicsContainer.comics)
    }
}

