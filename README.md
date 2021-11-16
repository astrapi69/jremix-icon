# Overview

<div style="text-align: center">

[![Build Status](https://travis-ci.com/astrapi69/jremix-icon.svg?branch=master)](https://travis-ci.com/github/astrapi69/jremix-icon)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/jremix-icon.svg?style=flat)](https://github.com/astrapi69/jremix-icon/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/jremix-icon/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/jremix-icon)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

a java port of the famous RemixIcon project.

Basic set of desktop icons for java swing or FX application.

The original icons are from the [RemixIcon project](https://github.com/Remix-Design/RemixIcon) and designed from Remix Design Studio Team.

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/jremix-icon" data-icon="octicon-star" aria-label="Star astrapi69/jremix-icon on GitHub">Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)


# Template from this project

You can derive your java library project from this you can easily and adapt to your specific project if you follow the
instruction from this [medium blog](https://asterios-raptis.medium.com/new-github-template-repository-feature-ec09afe261b8)

## Note

No animals were harmed in the making of this library.

## License

The source code comes under the liberal MIT License, making jremix-icon great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~jremix-icon~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of jremix-icon:

Than you can add the dependency to your dependencies:

	<properties>
			...
		<!-- jremix-icon version -->
		<jremix-icon.version>1.1</jremix-icon.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- jremix-icon DEPENDENCY -->
			<dependency>
				<groupId>io.github.astrapi69</groupId>
				<artifactId>jremix-icon</artifactId>
				<version>${jremix-icon.version}</version>
			</dependency>
			...
		</dependencies>

## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of jremix-icon:

define version in file gradle.properties
```
jremixIconVersion=1.1
```

or in build.gradle ext area

```
ext {
			...
    jremixIconVersion = "1.1"
			...
}
```

then add the dependency to the dependencies area

```
dependencies {
			...
    implementation("io.github.astrapi69:jremix-icon:$jremixIconVersion")
			...
}
```

# Load icons

This project provides only the icons. For load the icons in your application you can import the 
dependency 'io.github.astrapi69:icon-img-extensions' as shown in the following example:

```
    String imagePath = "io/github/astrapi69/remixicon/Document/folder-3-fill.svg";
    ImageIcon applicationAdd = ImageIconFactory.newImageIconFromSVG(imagePath, 16, 16);
    JButton btnApplicationAdd = IconButtonFactory.newIconButton(applicationAdd, "New application");
    assertNotNull(btnApplicationAdd);
```

For do this you need the batik dependencies. See the unit test class LoadIconTest and the build.gradle 
for more information.

The classes ImageIconFactory and IconButtonFactory are helper classes that are defined in the project
[]()
resources

# Donations

This project is kept as an open source product and relies on contributions to remain being
developed. If you like this library, please consider a donation

over paypal: <br><br>
<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" style="border: none" />
</a>
<br><br>
or over bitcoin(BTC) with this address:

bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy.png"
alt="Donation Bitcoin Wallet" width="250"/>

or over FIO with this address:

FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop.png"
alt="Donation FIO Wallet" width="250"/>

or over Ethereum(ETH) with:

0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D.png"
alt="Donation Ethereum Wallet" width="250"/>

or over Ethereum Classic(ETC) with:

0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD.png"
alt="Donation Ethereum Classic Wallet" width="250"/>

or over Dogecoin(DOGE) with:

D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1.png"
alt="Donation Dogecoin Wallet" width="250"/>

or over Monero(XMR) with:

49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw.png"
alt="Donation Monero Wallet" width="250"/>

or over the donation buttons at the top.

## Semantic Versioning

The versions of jremix-icon are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for jremix-icon are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/jremix-icon/fork](https://github.com/astrapi69/jremix-icon/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/jremix-icon/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the jremix-icon developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/jremix-icon/issues).

## Similar projects

## Credits

