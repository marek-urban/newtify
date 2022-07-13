package sk.best.newtify.web.gui.view;

import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import sk.best.newtify.web.gui.layout.MainLayout;

/**
 * @author Marek Urban
 * Copyright © 2022 BEST Technická univerzita Košice.
 * All rights reserved.
 */
@PageTitle("News")
@RouteAlias(value = "", layout = MainLayout.class)
@Route(value = "news", layout = MainLayout.class)
public class NewsView extends FlexLayout {

    private static final long serialVersionUID = 3099557670692343467L;

    private final VerticalLayout middleContent      = new VerticalLayout();
    private final VerticalLayout leftWidgetContent  = new VerticalLayout();
    private final VerticalLayout rightWidgetContent = new VerticalLayout();

    public NewsView() {

    }
}
