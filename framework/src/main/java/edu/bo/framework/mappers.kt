package edu.bo.framework

import app.edu.bo.framework.Movie as ServerBook
import app.edu.bo.domain.Movie as DomainBook

fun ServerBook.toDomainBook() : DomainBook {
    return DomainBook( id, title, description, authors, createdDate, category)
}
