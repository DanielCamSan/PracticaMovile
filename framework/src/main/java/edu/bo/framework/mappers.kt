package edu.bo.framework

import app.bo.com.ucb.framework.Movie as ServerBook
import app.bo.com.ucb.domain.Movie as DomainBook

fun ServerBook.toDomainBook() : DomainBook {
    return DomainBook( id, title, description, authors, createdDate, category)
}
