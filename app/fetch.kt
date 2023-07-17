fun fetch(username: String) {
        viewModelScope.launch {
            val user = withContext(Dispatchers.IO) {
                val db = buildDB(getApplication())
                db.userDao().selectProfile(username)
            }
            userLD.postValue(user)
        }
    }