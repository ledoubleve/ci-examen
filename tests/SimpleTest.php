<?php
use PHPUnit\Framework\TestCase;
include('functions.php');
include('config.php');

class StackTest extends TestCase
{
    const configs = [
        'name',
        'nav_menu',
        'template_path',
        'content_path',
        'pretty_uri',
        'version'
    ];

    public function testConfig()
    {
        foreach (self::configs as $config) {
            $this->assertNotEmpty(config($config));
        }
    }
}
