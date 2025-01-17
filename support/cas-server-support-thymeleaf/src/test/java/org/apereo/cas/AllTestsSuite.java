package org.apereo.cas;

import org.apereo.cas.nativex.CasThymeleafRuntimeHintsTests;
import org.apereo.cas.services.web.CasThymeleafTemplatesDirectorTests;
import org.apereo.cas.services.web.CasThymeleafViewResolverConfigurerTests;
import org.apereo.cas.services.web.ThemeBasedViewResolverTests;
import org.apereo.cas.web.view.CasMustacheViewTests;
import org.apereo.cas.web.view.CasProtocolThymeleafViewFactoryTests;
import org.apereo.cas.web.view.CasThymeleafConfigurationTests;
import org.apereo.cas.web.view.ChainingTemplateViewResolverTests;
import org.apereo.cas.web.view.RestfulUrlTemplateResolverTests;
import org.apereo.cas.web.view.ThemeClassLoaderTemplateResolverTests;
import org.apereo.cas.web.view.ThemeFileTemplateResolverTests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    CasThymeleafViewResolverConfigurerTests.class,
    ChainingTemplateViewResolverTests.class,
    CasProtocolThymeleafViewFactoryTests.class,
    CasThymeleafTemplatesDirectorTests.class,
    ThemeFileTemplateResolverTests.class,
    ThemeBasedViewResolverTests.class,
    CasMustacheViewTests.class,
    CasThymeleafRuntimeHintsTests.class,
    ThemeClassLoaderTemplateResolverTests.class,
    RestfulUrlTemplateResolverTests.class,
    CasThymeleafConfigurationTests.class
})
@Suite
public class AllTestsSuite {
}
