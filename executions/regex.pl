use strict;

my $str = 'any text here 1 2 3 4 5';
my $regex = qr/[a-f]/ip;
my $subst = '*';

if ( $str =~ /$regex/g ) {
  print "Whole match is ${^MATCH} and its start/end positions can be obtained via \$-[0] and \$+[0]\n";
}

my $result = $str =~ s/$regex/$subst/rg;
print $result; # Return *ny t*xt h*r* 1 2 3 4 5