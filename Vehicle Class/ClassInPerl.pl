use strict; 
use warnings; 

package vehicle; 

# constructor 
sub vehicle_data 
{ 

	# shift will take package name 'student' 
	# and assign it to variable 'class' 
	my $class_name = shift; 
	my $self = { 
				'price' => shift, 
				'color' => shift,
				'model' => shift
			}; 
	# Using bless function 
	bless $self, $class_name; 
	
	# returning object from constructor 
	return $self; 
} 

# Object creationg and constructor calling 
my $Data = vehicle_data vehicle(1000,"white" , '000rxt5'); 

# Printing the data 
print "$Data->{'price'}\n"; 
print "$Data->{'color'}\n";
print "$Data->{'model'}\n";
 

