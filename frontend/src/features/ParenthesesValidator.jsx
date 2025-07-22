import { useState } from 'react';

function ParenthesesValidator() {
    const [input, setInput] = useState('');
    const [result, setResult] = useState(null);

    const handleCheck = async () => {
        try {
            const response = await fetch(`https://codecrumbs.onrender.com/api/isValid?input=${encodeURIComponent(input)}`);
            const isValid = await response.json();
            setResult(isValid);
        } catch (error) {
            console.error('Error validating:', error);
            setResult('Validation error');
        }
    };

    return (
        <div>
            <h2>Parentheses Validator</h2>
            <input
                type="text"
                value={input}
                onChange={e => setInput(e.target.value)}
                placeholder="Enter a string like ()[]{}"
                style={{ marginRight: '0.5rem' }}
            />
            <button onClick={handleCheck}>Validate</button>

            {result !== null && (
                <p>
                    Result:{' '}
                    {result === true
                        ? 'Valid ✅'
                        : result === false
                            ? 'Invalid ❌'
                            : result}
                </p>
            )}
        </div>
    );
}

export default ParenthesesValidator;