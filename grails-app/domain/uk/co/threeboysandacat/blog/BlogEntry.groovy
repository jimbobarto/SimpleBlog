package uk.co.threeboysandacat.blog

class BlogEntry {

    String title
    Date date
    Boolean isHidden

    List tags
    List rows
    static hasMany = [rows: Row, tags: String]

    //author
    //location



    static constraints = {
    }
}
