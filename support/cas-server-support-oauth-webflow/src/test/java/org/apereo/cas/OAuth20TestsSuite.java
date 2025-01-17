package org.apereo.cas;

import org.apereo.cas.nativex.CasOAuth20RuntimeHintsTests;
import org.apereo.cas.support.oauth.web.flow.OAuth20RegisteredServiceUIActionTests;
import org.apereo.cas.support.oauth.web.flow.OAuth20WebflowConfigurerTests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * This is {@link OAuth20TestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.2.0
 */
@SelectClasses({
    CasOAuth20RuntimeHintsTests.class,
    OAuth20RegisteredServiceUIActionTests.class,
    OAuth20WebflowConfigurerTests.class
})
@Suite
public class OAuth20TestsSuite {
}
