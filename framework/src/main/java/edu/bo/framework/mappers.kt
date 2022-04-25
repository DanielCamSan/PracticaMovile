package edu.bo.framework


import edu.bo.framework.Book as ServerBook
import edu.bo.domain.Book as DomainBook

fun ServerBook.toDomainBook() : DomainBook {
    return DomainBook( id, title, description, authors, createdDate, category)
}
