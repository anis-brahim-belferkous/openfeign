package hu.me.iit.distributedsystems.openfeignclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static javax.swing.text.html.parser.DTDConstants.ID;

@RestController
@RequiredArgsConstructor
public class ComplexController {
    private static final int BIG_BOOK_PAGE_THRESHOLD = 100;
    private final ArticlesClient articlesClient;
    private final subjectClient subjectClient;


    @GetMapping("find-all-big-book")
    List<ArticleDto> findAllBigBook() {
        return articlesClient.allArticles().stream()
                .filter(article -> article.getPages() > BIG_BOOK_PAGE_THRESHOLD)
                .toList();
    }

    @GetMapping("find-all-subjects")
    List<subjectDto> findAllSubjects() {
        return  subjectClient.findAllSubjects();
    }



}
