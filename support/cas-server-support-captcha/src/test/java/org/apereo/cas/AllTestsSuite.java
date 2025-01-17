package org.apereo.cas;

import org.apereo.cas.nativex.CasCaptchaRuntimeHintsTests;
import org.apereo.cas.web.flow.CasCaptchaWebflowConfigurerTests;
import org.apereo.cas.web.flow.InitializeCaptchaActionTests;
import org.apereo.cas.web.flow.ValidateCaptchaActionTests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    CasCaptchaWebflowConfigurerTests.class,
    CasCaptchaRuntimeHintsTests.class,
    InitializeCaptchaActionTests.class,
    ValidateCaptchaActionTests.class
})
@Suite
public class AllTestsSuite {
}
