#!/bin/bash
echo "Running SAML server..."

SCENARIO="saml2-idp-login-sp-passive-authnrequest"

metadataDirectory="${PWD}/ci/tests/puppeteer/scenarios/${SCENARIO}/saml-md"

cert=$(cat "${metadataDirectory}"/idp-signing.crt | sed 's/-----BEGIN CERTIFICATE-----//g' | sed 's/-----END CERTIFICATE-----//g')
export IDP_SIGNING_CERTIFICATE=$cert
echo -e "Using signing certificate:\n$IDP_SIGNING_CERTIFICATE"

cert=$(cat "${metadataDirectory}"/idp-encryption.crt | sed 's/-----BEGIN CERTIFICATE-----//g' | sed 's/-----END CERTIFICATE-----//g')
export IDP_ENCRYPTION_CERTIFICATE=$cert
echo -e "Using encryption certificate:\n$IDP_ENCRYPTION_CERTIFICATE"

echo "SAML SP is to send passive authentication requests"
export SP_PASSIVE_AUTHN=true

chmod +x "${PWD}/ci/tests/saml2/run-saml-server.sh"
"${PWD}/ci/tests/saml2/run-saml-server.sh"
