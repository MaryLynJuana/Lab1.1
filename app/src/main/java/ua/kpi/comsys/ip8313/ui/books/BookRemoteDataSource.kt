package ua.kpi.comsys.ip8313.ui.books

class BookRemoteDataSource(private val api: BookApi): BookDataSource {
    override suspend fun getSearchedBooks(searchQuery: String): List<Book> {
        return api.getSearchedBooks(req = searchQuery).books
    }
    override suspend fun getBookData(bookId: String): Book {
        return api.getBookData(id = bookId)
    }
    override suspend fun saveBooks(bookList: List<Book>) {
        TODO("Not yet implemented")
    }

    override suspend fun saveBookData(book: Book) {
        TODO("Not yet implemented")
    }
}