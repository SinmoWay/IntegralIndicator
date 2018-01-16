package root.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import root.ui.builder.DialogBuilder;
import root.ui.builder.ImgResourceBuilder;
import root.ui.builder.TreeBuilder;

@Configuration
public class CommonBeanConfiguration {

    @Bean
    public DialogBuilder getAlertBuilder() {
        return new DialogBuilder();
    }

    @Bean
    public ImgResourceBuilder getImgResourceBuilder() {
        return new ImgResourceBuilder();
    }

    @Bean
    public TreeBuilder getTreeBuilder() {
        return new TreeBuilder();
    }
}