package handzap.firstProj.rest;

import handzap.firstProj.App;
import handzap.firstProj.Article;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class NewspaperArticleRest {

    @GET
    @Path("/article/authors")
    @Produces(MediaType.APPLICATION_JSON)
    public List<?> getAuthors() {
        return App.getAllAuthors();
    }

    @GET
    @Path("/article/authors/{authorName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getArticlesByAuthor(@PathParam("authorName") String authorName){
        return App.getAllArticlesByAuthor(authorName);
    }

    @GET
    @Path("/article:search")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> searchNewspaperArticleData(@QueryParam("title") String title, @QueryParam("description") String description) {
        return App.getAllArticlesByTitleDesc(title, description);
    }
}
